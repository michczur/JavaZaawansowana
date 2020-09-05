package FuctionalPrograming.zad1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Season season1 = new Season(
                "Dark", 3,
                List.of(
                        new Episode("Dark1", 1, List.of(
                                new Video("ciemno", "url", VideoType.EPISODE),
                                new Video("ciemno", "url", VideoType.PREVIEW))),
                        new Episode("Dark2", 2, List.of(
                                new Video("ciemniej", "url", VideoType.EPISODE),
                                new Video("ciemniej", "url", VideoType.PREVIEW))),
                        new Episode("Dark3", 3, List.of(
                                new Video("najciemniej", "url", VideoType.EPISODE),
                                new Video("najciemniej", "url", VideoType.PREVIEW)))
                )
        );
        Season season2 = new Season(
                "light", 3,
                List.of(
                        new Episode("light1", 1, List.of(
                                new Video("jasno", "url", VideoType.EPISODE),
                                new Video("jasno", "url", VideoType.PREVIEW))),
                        new Episode("light2", 2, List.of(
                                new Video("jasniej", "url", VideoType.EPISODE),
                                new Video("jasniej", "url", VideoType.PREVIEW))),
                        new Episode("light3", 3, List.of(
                                new Video("najjasniej", "url", VideoType.EPISODE),
                                new Video("najjasniej", "url", VideoType.PREVIEW)))
                )
        );
        Season season3 = new Season(
                "Colorful", 3,
                List.of(
                        new Episode("Colorful1", 1, List.of(
                                new Video("kolorowo", "url", VideoType.EPISODE),
                                new Video("kolorowo", "url", VideoType.PREVIEW))),
                        new Episode("Colorful2", 2, List.of(
                                new Video("kolorowiej", "url", VideoType.EPISODE),
                                new Video("kolorowiej", "url", VideoType.PREVIEW))),
                        new Episode("Colorful3", 3, List.of(
                                new Video("najkolorowiej", "url", VideoType.EPISODE),
                                new Video("najkolorowiej", "url", VideoType.PREVIEW)))
                )
        );
        // listę wszystkich epizodów
        season1.episodes.stream().forEach(System.out::println);
        // listę wszystkich filmow
        season1.episodes.stream().forEach((e) -> {
            e.videos.forEach(System.out::println);
        });
        // listę wszystkich nazw sezonów
        //season1.????.stream().forEach((s) -> {
        //  s.seasonName.forEach(System.out::println); // Poprawic
        //});
        // listę wszystkich numerów sezonów
        //season1.????.stream().forEach((s) -> {
        // s.seasonNumber.forEach(System.out::println); // Poprawic
        //});
        // listę wszystkich nazw epizodów
        //season1.episodes.stream().forEach((e) -> {
        //e.episodeName.forEach(System.out::println); // Poprawic
        //});
        //listę wszystkich numerów epizodów

        //listę wszystkich nazw video

        //listę wszystkich adresów url dla każdego video

        //tylko epizody z parzystych sezonów

        //tylko video z parzystych sezonów

        //tylko video z parzystych epizodów i sezonów

        //tylko video typu Clip z parzystych epizodów i nieparzystych sezonów

        //tylko video typu Preview z nieparzystych epizodów i parzystych sezonów


    }
}