/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.io.Serializable;

/**
 *
 * @author Bernard Skerritt x14110717
 */
public class TrigQuestion extends AlgebraQuestion implements Serializable {
    String image;
    
    public TrigQuestion(String questionTitle, String a1, String a2, String a3, int correctAns, String image) {
        super(questionTitle, a1, a2, a3, correctAns);
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}