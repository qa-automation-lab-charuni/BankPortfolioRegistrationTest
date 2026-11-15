import { Page, Locator, expect } from "@playwright/test";
import { RegisterSuccessPage} from './RegisterSuccessPage';

export class RegisterPage{
    readonly page: Page;
    readonly fullNameInputElement : Locator;
    readonly emailInputElement : Locator;
    readonly phoneInputElement : Locator;
    readonly passwordInputElement : Locator;
    readonly conirmPasswordInputElement : Locator;
    readonly submitButtonElement : Locator;

    constructor(page: Page){
        this.page = page;
        this.fullNameInputElement = this.page.getByTestId('register-name');
        this.emailInputElement = this.page.getByTestId('register-email');
        this.phoneInputElement = this.page.getByTestId('register-phone');
        this.passwordInputElement = this.page.getByTestId('register-password');
        this.conirmPasswordInputElement = this.page.getByTestId('register-confirm');
        this.submitButtonElement = page.locator('button#regSubmit');

    }

    async enterFullName(fullName: string): Promise<RegisterPage>{
        await this.fullNameInputElement.fill(fullName);
        return this;
    }

    async enterEmail(email: string): Promise<RegisterPage>{
        await this.emailInputElement.fill(email);
        return this;
    }

    async enterPhone(phone: string): Promise<RegisterPage>{
        await this.phoneInputElement.fill(phone);
        return this;
    }

    async enterPassword(password: string): Promise<RegisterPage>{
        await this.passwordInputElement.fill(password);
        return this;
    }

    async enterConfirmPassword(confirmPassword: string): Promise<RegisterPage>{
        await this.conirmPasswordInputElement.fill(confirmPassword);
        return this;
    }

    async clickSubmit(): Promise<RegisterSuccessPage>{
        await this.submitButtonElement.click();
        return new RegisterSuccessPage(this.page);
    }
}
