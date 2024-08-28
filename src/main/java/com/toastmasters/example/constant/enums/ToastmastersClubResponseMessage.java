package com.toastmasters.example.constant.enums;

public enum ToastmastersClubResponseMessage {
    Toastmasters_Club_ALREADY_EXISTS("Toastmasters Club with name %s already exists"),
    Toastmasters_Club_NOT_FOUND("Toastmasters Club with name %s is not found"),
    Toastmasters_Club_NOT_EXISTS("Toastmasters Club not available"),
    FAILED_TO_SAVE_Toastmasters_Club("Failed to save Toastmasters Club for name: %s"),
    Toastmasters_Club_SUCCESSFULLY_UPDATED("Toastmasters Club with name %s updated successfully"),
    Toastmasters_Club_SUCCESSFULLY_DELETED("Toastmasters Club with name %s is deleted successfully"),
    Toastmasters_Club_ALREADY_DELETED("Toastmasters Club with name %s is already deleted");

    private final String message;

    ToastmastersClubResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage(Long clubId) {
        return String.format(message, clubId);
    }
}
