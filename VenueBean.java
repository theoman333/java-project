/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name = "venueBean")
@ApplicationScoped
public class VenueBean implements Serializable {

    private List<String> items;
    
    public VenueBean() {
        items = new ArrayList<>();
        items.add("Please choose the venue ");
        items.add("Jerusalem");
        items.add("Stockholm");
        items.add("Tokyo");
        items.add("Kiryat Ata");
    }
    
    public List<String> getItems() {
        return items;
    }
    
}

