public class user {

    public static void main(String[] args) {
        String str="this is the word of this";
        String[] str1=str.split(" ");
        int count=0;
        for (int i=0;i<str1.length-1;i++)
        {
            for (int j=i+1;j<str1.length;j++){
                if(str1[i].equals(str1[j])){
                    ++count;
                }
            }

            break;
        }
        System.out.println(count);
    }

}
