import { Page, Locator } from "@playwright/test";
import{RegisterPage} from './RegisterPage';

export class HomePage{
    readonly page: Page;
    readonly registerLinkElement: Locator;

    constructor(page: Page){
        this.page = page;
        this.registerLinkElement=page.getByTestId('link-register');
    }

    async navigateToHomePage(){
        await this.page.goto('/playwright/tta-bank/');
    }

    async clickOpenAccountLink(): Promise<RegisterPage>{
        await this.registerLinkElement.click();
        return new RegisterPage(this.page);
    }
}