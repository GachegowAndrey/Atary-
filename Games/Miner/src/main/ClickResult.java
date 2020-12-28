package main;

public enum  ClickResult {
    REGULAR,/* Ничего специфического не произшло */
    OPENED,/* Клетка была открыта, но в ней не оказалось мины */
    DETONATED /* Клетка была открыта и в ней оказалась мина */
}
