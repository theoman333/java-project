/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "menuBean")
@ViewScoped
public class MenuBean implements Serializable {

    private String selectedOption;
    private Map<String, String> optionImageMap;

    public MenuBean() {
        optionImageMap = new LinkedHashMap<>();
        optionImageMap.put("Choose the artist", "/coldplay.jpg");
        optionImageMap.put("Coldplay", "/coldplay.jpg");
        optionImageMap.put("Queen", "/queen.jpg");
        optionImageMap.put("Red Hot Chili Peppers", "/rhcp.jpg");
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public Map<String, String> getOptionImageMap() {
        return optionImageMap;
    }

    public String getImagePath() {
        return optionImageMap.get(selectedOption);
    }

    public SelectItem[] getItems() {
        SelectItem[] items = new SelectItem[optionImageMap.size()];
        int i = 0;
        for (String option : optionImageMap.keySet()) {
            items[i++] = new SelectItem(option);
        }
        return items;
    }
}
