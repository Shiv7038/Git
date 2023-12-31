public class aa {
    public static void main(String[] args) {

        System.out.println("Hi Priya");
        String str="Process finished with exit code";
        String[] ar=str.split(" ");
        String revst="";
        for(int i=0; i<ar.length;i++){
            String word=ar[i];
            char []ch=word.toCharArray();
            String rev="";
            for(int j=ch.length-1;j>=0;j--){
                rev=rev+ch[j];
            }
            revst=revst+rev+" ";
        }
        System.out.println(revst);

    }
}
