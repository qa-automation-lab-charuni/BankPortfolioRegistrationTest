import { Page, Locator, expect } from "@playwright/test";

export class RegisterSuccessPage{
    readonly page:Page;
    readonly profileNameElement : Locator;
    readonly accountHolderName : Locator;

    constructor(page: Page){
        this.page = page;
        this.profileNameElement = this.page.getByTestId('nav-user');
        this.accountHolderName = this.page.getByTestId('account-holder');
    }

    async verifyProfielName(expectedMessage: string): Promise<void>{
        await expect(this.profileNameElement).toHaveText(expectedMessage);
    }

    async verifyAccountHolderName(expectedMessage: string): Promise<void>{
        await expect(this.accountHolderName).toHaveText(expectedMessage);
    }
}