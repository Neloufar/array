/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package characterarray;

/**
 *
 * @author neliloghmani
 */
public class CharacterArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder input = new StringBuilder("NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109");
        System.out.println("The orginial string ");
        System.out.println(input);
        for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			if(Character.isDigit(input.charAt(i))) {
				input.replace(i, i+1,"*");
                               
			}                  
                        else if (Character.isLowerCase(input.charAt(i)))
                        {  
                        System.out.print(Character.toUpperCase(input.charAt(i)));
                        }
                        else if (Character.isUpperCase(input.charAt(i)))
                        {
                         System.out.print(Character.toLowerCase(input.charAt(i)));
                        }

                
                }
        
        System.out.print("\n " + input);
        
    
    }


}
    
