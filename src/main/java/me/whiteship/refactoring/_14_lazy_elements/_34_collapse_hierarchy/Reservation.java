package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;

    private String courtNumber;

    // Refactoring > Push members up/down으로 필드 이동 가능
}
