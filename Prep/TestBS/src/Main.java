import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
//        TreeSet<Object> treeset = new TreeSet<>() ;
//        Integer a = 10;
//        Integer b = 20;
//        String str = "Hello";
//        String none = null;
//        treeset.add(a);
//        treeset.add(b);
//        treeset.add(str);
//        treeset.add(none);
////        for(Object obj: treeset) {
////            System.out.println(obj);
////        }
//        System.out.println(treeset);
//        int[] arr = new int[]{2,7,8,9,5,3,1,0,0,0,0};
//        int ele = 9;
//        int ins = 10;
//        for(int i = arr.length-1;i>0;i--) {
//            if(arr[i-1]!=ele) {
//                arr[i] = arr[i-1];
//            } else {
//                arr[i] = ins;
//                break;
//            }
//        }
//        for(int i: arr) {
//            System.out.print(i+" ");
//        }

//        Set<Integer> set = new HashSet<>();
//        for(int i: arr) {
//            if(set.contains(i)) {
//                set.remove(i);
//            } else {
//                set.add(i);
//            }
//        }
//        System.out.println(set);
        int[] arr = new int[]{8,6,9,5,3,2,8,9,6,4,1,3,8};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for(Map.EntrySet<Integer, Integer>)
    }
}


//i/p [2,7,8,9,5,3,1,0,0,0,0] 
// insert 10 
// o/p [2,7,8,9,10,5,3,1,0,0,0]


//Employee[Empid, name, sal, deptid]
//Dept[deptid, name, location]

//max sal of emp based on loc

select e.name, max(e.sal), d.loc from Employee e, Dept d on e.deptId = d.deptId group by d.loc;

//Colleges[Id, CollegeName] [1,"CBIT"] [2,"BITS"] [3,"IITH"] [4,"JNTUH"]  Branch[Id, BranchName] [1,"CSC"] [2,"ECE"] [3,"EEE"] [4,"MECH"]  cobra[collegeid,branchid] [1,1] [1,2] [2,1] [2,3] [2,4] [3,1] [3,2] [3,3]

//list of colleges having only csc and ece braches

//Colleges[Id, CollegeName]
//Branch[Id, BranchName]
//cobra[collegeid,branchid]



select c.CollegeName, b.BranchName from CollegeName c, BranchName b, Cobra s on c.id = s.collegeId and b.id = s.branchId
where b.branchName IN ['CSC', 'ECE'] and b.branchName NOT IN ['EEE', 'MECH'];


















