export default {
	loginButtononClick () {
		if (usernameInput.text === "admin" && passwordInput.text === "admin123") {
			storeValue("authUser", usernameInput.text);
			navigateTo("Main Menu");  // Replace with your next page
		} else {
			showAlert("Invalid credentials", "error");
		}
	}
}