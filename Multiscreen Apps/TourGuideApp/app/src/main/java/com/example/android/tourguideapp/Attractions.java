package com.example.android.tourguide;

public class Attractions {

    // Info of the attraction
    private String outputInfoOnCategory;

    // Title of the attraction
    private String outputTitleforCategory;

    // Image of the attraction
    private int outputImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Outputs per attraction
    public Attractions(String inputInfoOnCategory, String inputTitleforCategory, int inputImageResourceId) {
        outputInfoOnCategory = inputInfoOnCategory;
        outputTitleforCategory = inputTitleforCategory;
        outputImageResourceId = inputImageResourceId;
    }

    // Get the outputs for info, title and image
    public String getOutputInfoOnCategory() {
        return outputInfoOnCategory;
    }

    public String getOutputTitleforCategory() {
        return outputTitleforCategory;
    }

    public int getImageResourceID() {
        return outputImageResourceId;
    }

    public boolean hasImage() {
        return outputImageResourceId != NO_IMAGE_PROVIDED;
    }
}
