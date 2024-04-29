package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {

        NewCounter input=new NewCounter();
        String input_text="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Maecenas sed enim ut sem viverra aliquet. Ultrices neque ornare aenean euismod elementum nisi quis eleifend. Ridiculus mus mauris vitae ultricies leo integer malesuada. Lorem ipsum dolor sit amet consectetur adipiscing. Morbi tristique senectus et netus et malesuada. Tincidunt tortor aliquam nulla facilisi cras. Posuere ac ut consequat semper viverra nam libero. Felis imperdiet proin fermentum leo. Dolor sed viverra ipsum nunc aliquet bibendum enim facilisis. Eu ultrices vitae auctor eu augue ut. Non curabitur gravida arcu ac tortor. Est sit amet facilisis magna etiam tempor. Lobortis mattis aliquam faucibus purus. Enim sed faucibus turpis in eu. Justo donec enim diam vulputate ut pharetra sit. Risus feugiat in ante metus dictum at. Ornare arcu odio ut sem nulla pharetra diam. Volutpat commodo sed egestas egestas.\n" +
                "\n" +
                "Sem viverra aliquet eget sit amet. At elementum eu facilisis sed odio morbi quis. Risus quis varius quam quisque id. Pharetra magna ac placerat vestibulum. Faucibus interdum posuere lorem ipsum dolor sit. Donec enim diam vulputate ut pharetra sit amet aliquam. Tempor orci eu lobortis elementum nibh tellus. Sed velit dignissim sodales ut eu sem integer vitae justo. Suspendisse sed nisi lacus sed viverra tellus in. Urna porttitor rhoncus dolor purus non. Ultrices vitae auctor eu augue ut lectus arcu bibendum. Lobortis feugiat vivamus at augue eget arcu dictum.\n" +
                "\n" +
                "Pharetra vel turpis nunc eget lorem. Habitant morbi tristique senectus et netus et. Duis convallis convallis tellus id interdum velit laoreet. Praesent tristique magna sit amet purus gravida quis blandit turpis. Ornare suspendisse sed nisi lacus sed viverra. Arcu felis bibendum ut tristique et egestas quis ipsum suspendisse. At risus viverra adipiscing at in tellus integer feugiat scelerisque. Quis eleifend quam adipiscing vitae proin sagittis. Facilisi etiam dignissim diam quis enim lobortis. Sapien pellentesque habitant morbi tristique senectus et netus et. Urna duis convallis convallis tellus id interdum velit laoreet. Suscipit adipiscing bibendum est ultricies integer quis auctor elit.\n" +
                "\n" +
                "Neque volutpat ac tincidunt vitae semper. Vel eros donec ac odio tempor orci. Facilisis gravida neque convallis a cras semper auctor neque vitae. Urna porttitor rhoncus dolor purus non enim praesent elementum facilisis. Tincidunt eget nullam non nisi est sit amet facilisis magna. Amet purus gravida quis blandit turpis cursus in. Etiam sit amet nisl purus in mollis nunc. Mattis enim ut tellus elementum sagittis vitae et. Varius morbi enim nunc faucibus. Vel orci porta non pulvinar neque. Purus gravida quis blandit turpis. Iaculis urna id volutpat lacus laoreet.\n" +
                "\n" +
                "Vivamus arcu felis bibendum ut. Libero enim sed faucibus turpis in. Molestie a iaculis at erat pellentesque adipiscing commodo elit at. Velit ut tortor pretium viverra suspendisse potenti nullam ac. Tortor posuere ac ut consequat semper viverra nam. Ipsum a arcu cursus vitae congue mauris rhoncus. Vel pharetra vel turpis nunc eget lorem dolor sed viverra. Sed vulputate mi sit amet mauris commodo quis imperdiet massa. Tortor vitae purus faucibus ornare. Sit amet venenatis urna cursus. Elit ut aliquam purus sit amet luctus venenatis lectus magna.";
        input.parse(input_text);
        String example="sit";
        int wcount=input.getCount(example);
        System.out.println(example+" "+wcount);
        SortedSet<String> allWords=input.getUniqueWords();
        System.out.println(allWords);
        input.printWordCounts();


    }
}
