import com.hs.server.domain.Person;
import org.assertj.core.util.Lists;
import org.json.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * description:${todo} <br/>
 * Date:     2017/7/12 20:56<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class TestJDK8 {
    @Test
    public void convertTest() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected.add("cool");
        collected.add("delta");
        collected.stream().map(string -> string.toUpperCase())
                .count();
        System.out.println(collected);//此处打印出来的是大写还是小写，为什么？
        List<String> collect = collected.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void longChainTest() {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();p1.setAge(1);
        Person p2 = new Person();p2.setAge(2);
        Person p3 = new Person();p3.setAge(3);
        Person p4 = new Person();p4.setAge(4);
        Person p5 = new Person();p5.setAge(5);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        List<Integer> ages = new ArrayList<>();
        personList.stream().forEach(person -> ages.add(person.getAge()));
        System.out.println(ages);//第一处打印
        ages.clear();
        personList.stream().map(person -> {
            person.setAge(person.getAge() + 10);
            return person;
        }).count();
        personList.stream().forEach(person -> ages.add(person.getAge()));
        System.out.println(ages);//第二处打印
//问两处打印的值是否相同，为什么？

        List<Person> collect = personList.stream().peek(person -> person.setAge(person.getAge() * 2)).peek(person -> person.setAge(person.getAge() +1)).sorted((o1, o2) -> o2.getAge().compareTo(o1.getAge())).collect(Collectors.toList());
        System.out.println(personList);
        List<Person> collect1 = collect.parallelStream().sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());

        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is:"+nums.stream().filter(num -> num != null).
        distinct().mapToInt(num -> num * 2).
        peek(System.out::println).skip(2).limit(4).sum());

    }

    @Test
    public void test2(){
        System.out.println((long)(1.234));

        List<Map<String, String>> list = new ArrayList<>();
        list.add(new HashMap<>());
        list.get(0).put("11","a11");
        list.get(0).put("22","a22");
        list.get(0).put("33","a33");

        JSONArray hostInfo = new JSONArray(list);

        long round = Math.round(Double.valueOf(65536) * 4.79 / 100);
        System.out.println(round);
    }


}
