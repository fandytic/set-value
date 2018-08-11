/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Himpunan;
import javax.swing.*;
/**
 *
 * @author ITCS
 */
public class himpunan {
            //private static BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            public static void main(String[] args) throws Exception {
                        int x=Integer.parseInt(JOptionPane.showInputDialog("masukkan byk nya himpunan A: "));
                        //int x=Integer.parseInt(input.readLine());
                        int himpA [] = new int[x];
                        for(int i=0; i<x ; i++){
                                    String a=JOptionPane.showInputDialog("masukkan elemn A ke-"+(i+1)+" :");
                                    //String a=input.readLine();
                                    himpA[i]=Integer.parseInt(a);
                        }
                        System.out.print("A={");
                        for(int i=0;i<x;i++) {
                                    System.out.print(himpA[i]);
                                    if(i!=x-1)
                                    System.out.print(",");
                        }
                        System.out.println("}");
                        System.out.println();
                        //membuat irisan himpunan A
                        int y=Integer.parseInt(JOptionPane.showInputDialog("masukkan byk nya himpunan B: "));
                        //int y=Integer.parseInt(input.readLine());
                        int himpB [] = new int[y];
                        for(int i=0; i<y ; i++){
                                    String b=JOptionPane.showInputDialog("masukkan elemn B ke-"+(i+1)+" :");
                                    //String b=input.readLine();
                                   
                                    himpB[i]=Integer.parseInt(b);
                        }
                        System.out.print("B={");
for(int i=0;i<y;i++) {
                                    System.out.print(himpB[i]);
                                    if(i!=y-1)
                                    System.out.print(",");
                        }
                        System.out.println("}");
                        System.out.println();
                        System.out.print ("Irisan = {");
                        for (int i=0; i<x; i++){
                                    for (int j=0; j<y; j++){
                                                if (himpA[i]==himpB[j]){
                                                            System.out.print ("("+himpA[i]+")");
                                                }
                                    }
                        }
                        System.out.println ("}");
                        System.out.print ("Gabungan = {");
                        for (int i=0; i<x; i++){
                                    System.out.print ("("+himpA[i]+")");
                        }
                        boolean b = false;
                        for (int j = 0;j<y;j++){
                                    for (int i=0; i<x; i++){
                                                if (himpB[j]==himpA[i]){
                                                            b = true;
                                                            break;
                                                }
                                    }
                                    if (b==false){
                                                System.out.print ("("+himpB[j]+")");
                                    }
                                    b = false;
                        }
                        System.out.println ("}");
                        System.out.println ();
            }
}