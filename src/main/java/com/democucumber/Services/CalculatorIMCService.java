package com.democucumber.Services;

import org.springframework.stereotype.Component;

import com.democucumber.Models.User;

@Component
public class CalculatorIMCService {

	public String calculateIMC(final User user) {
		return classify(IMC(user));
	}

	private String classify(final float imc) {

		if (imc < 19)
			return "Abaixo do Peso";
		else if (imc < 25)
			return "Peso ideal";
		else if (imc < 30)
			return "Acima do Peso";
		else if (imc < 40)
			return "Obesidade";
		else
			return "Obesidade Grave";
	}

	private float IMC(final User user) {
		return user.getWeight() / (user.getHeight() * user.getHeight());
	}
}
