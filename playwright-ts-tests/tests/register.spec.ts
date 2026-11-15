import { test, expect} from "@playwright/test";
import { HomePage } from "../pages/HomePage";

test('User should be able to open an account successfully', async({page}) => {
    const homePage = new HomePage(page);
    await homePage.navigateToHomePage();
    const registerPage = await homePage.clickOpenAccountLink();
    await registerPage
    .enterFullName('cherryBee')
    .then((page => page.enterEmail('cherybee@gmail.com')));
    await registerPage.enterPhone('1568978563');
    await registerPage.enterPassword('456asdf*');
    await registerPage.enterConfirmPassword('456asdf*');
    const registerSuccessPage = await registerPage.clickSubmit();
    await registerSuccessPage.verifyAccountHolderName('cherryBee');
    //await registerSuccessPage.verifyProfielName('cherryBee');
}
);