interface area {  
    float pi = 3.14f;  
    void comp();  
}  

class InterProg implements area {  
    int radius;  
    InterProg(int r) {  
        radius = r;  
    }  
   public void comp() {  
        System.out.println("Area of circle is " + pi * radius * radius);  
    }  
    
    public static void main(String[] args) {  
        InterProg obj = new InterProg(25);
        obj.comp();  
    }  
}
