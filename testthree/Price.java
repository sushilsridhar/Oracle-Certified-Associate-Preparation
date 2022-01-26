class Price {
    public static void main(String... args) {
        int amount = 0b101;  //----- BINARY
        int amt = 0xE;       //----- HEXA DECIMAL
        System.out.println(amount+" "+amt);
        
        String hex = "FF23";
        Integer i = Integer.parseInt(hex,16);
        System.out.println("Integer value: "+i);
        
        // Fx 16-3 + F x 16-2 + 2 x 16 + 3
        //61,440 + 3840 + 35 = 65,315
        
        
        String hex1 = "E";
        Integer i1 = Integer.parseInt(hex1,16);
        System.out.println("HEXA DECIMAL to Integer value: "+i1);
        
        //0b101 ------------ BINARY
        // 1 2-0 + 0 x 2-1 + 1 x 2-2
        // 1 + 0 + 4 = 5 
        
        String bin = "101";
        Integer binValue = Integer.parseInt(bin,2);
        System.out.println("Binary to Integer value: "+binValue);
        
        
        
        // OCTAL
        // 1 x 8-0 + 2 x 8-1 + 1 x8-2
        // 1+ 16 + 16 = 32 base 10
        
        
        String oct = "121";
        Integer oct1 = Integer.parseInt(oct,8);
        System.out.println("Octal to Integer value: "+oct1); // prints 81
        
    }
}