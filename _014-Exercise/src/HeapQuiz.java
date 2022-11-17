public class HeapQuiz {
    int id = 0;

    public static void main (String [] args){
        int x =0;
        HeapQuiz [] hq = new HeapQuiz[5];

        while (x < 3){
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x++;
        }

        for (int index = 0; index < hq.length; index ++){
            System.out.println("Object " + index + " : " + hq[index]);
            if (hq[index] == null) continue;
            System.out.println("Object " + index + " id value: " + hq[index].id);
        }

        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        System.out.println();

        for (int index = 0; index < hq.length; index ++){
            System.out.println("Object " + index + " : " + hq[index]);
            if (hq[index] == null) continue;
            System.out.println("Object " + index + " id value: " + hq[index].id);
        }
    }
}
