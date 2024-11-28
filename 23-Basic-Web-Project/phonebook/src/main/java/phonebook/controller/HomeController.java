package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    List<Contact> contacts;

    public HomeController() {
        this.contacts = new ArrayList<>();
    }

    @GetMapping("/")
    private ModelAndView home(ModelAndView modelAndView){

        modelAndView.setViewName("index");
        modelAndView.addObject("contactsList", contacts);
        return modelAndView;
    }

    @PostMapping("/")
    private String addContact (Contact contact){

        this.contacts.add(contact);

        return "redirect:/";

    }

    @GetMapping("/edit{name}")
    private ModelAndView viewContactToEdit(@PathVariable String name, ModelAndView modelAndView){
        modelAndView.setViewName("edit");

        //вариант 1
        Contact contactToEdit = getContact(name);

        //вариант 2
        //Contact contactToEdit1 = this.contacts.stream().filter(c -> c.getName().equals(name)).findFirst().get();

        modelAndView.addObject(contactToEdit);

        return modelAndView;
    }

    @PutMapping("/edit{name}")
    private String editContact(@PathVariable String name, Contact contact){

        Contact contactToEdit = getContact(name);

        contactToEdit.setName(contact.getName());
        contactToEdit.setNumber(contact.getNumber());

        return "redirect:/";


    }

    @DeleteMapping("/delete{name}")
    private String delete(@PathVariable String name){

        Contact contactToDelete = getContact(name);

        this.contacts.remove(contactToDelete);

        return "redirect:/";
    }

    private Contact getContact(String name) {

        Contact contact = this.contacts.stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList()).get(0);

        return contact;
    }


}
