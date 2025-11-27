public class encrypted {
    public static void main(String[] args) {
        String text="I am rajatarora";
        System.out.println(text);
        char[] chars=text.toCharArray();
        for(char c: chars)
        {
            c+=9;
            System.out.print(c);
        }

    }
    
}
