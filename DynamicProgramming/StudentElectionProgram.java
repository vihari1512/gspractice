import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Problem Statement:
 * <p>
 * A group of students are sitting in a circle. The teacher is electing a new class president.
 * The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle.
 * Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle.
 * after the teacher is done singing, the next student is removed. The teacher repeats this until only one student is left.
 * A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
 * For example, suppose the song length is two (k=2). And there are four students to start with (1,2,3,4). The first student to go would be “2°, after that “4°, and after that ~3>. Student ~1° would be the next president in this example.
 * <p>
 * Signature:
 * <p>
 * public static int whoIsElected(int n, int k) {
 * }
 * <p>
 * Test Cases:
 * Input : 1, 1
 * Output :1
 * <p>
 * Input : 2, 2
 * Output :1
 * <p>
 * Input : 4, 2
 * Output :1
 */
public class StudentElectionProgram {

     static class List
    {
        List prev=null;
        List next=null;
        int value;
        public List(List prev,List next,int value)
        {
            this.prev=prev;
            this.next = next;
            this.value= value;
        }
    }
    public static int whoIsElected(int n, int k)
    {
        ArrayList<Integer> ll = new ArrayList<>();
        List first = new List(null,null,1);
        ll.add(1);
        List previous = first;
        List current = null;
        for(int i=2;i<n;i++)
        {
            current=new List(previous,null,i);
            previous.next=current;
            previous=current;
            ll.add(i);
        }
        List last = new List(previous,first,n);
        previous.next=last;
        first.prev=last;
        ll.add(n);
        List currentNode = first;
        while (ll.size()!=1)
        {
            int j = k;
            while(j!=0)
            {
                currentNode = currentNode.next;
                j--;
            }
            int value = currentNode.value;
            currentNode.prev.next=currentNode.next;
            currentNode.next.prev=currentNode.prev;
            currentNode=currentNode.next;
            ll.remove(new Integer(value));
        }
        return ll.get(0);

    }
    public static void main(String[] args)
    {
        System.out.println(whoIsElected(1,1));
        System.out.println(whoIsElected(2,2));
        System.out.println(whoIsElected(4,2));
    }

}
