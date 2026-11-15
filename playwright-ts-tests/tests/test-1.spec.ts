import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://app.thetestingacademy.com/playwright/tta-bank/');
  await page.getByTestId('link-register').click();
  await page.getByTestId('register-name').click();
  await page.getByTestId('register-name').fill('cherry');
  await page.getByTestId('register-name').press('CapsLock');
  await page.getByTestId('register-name').fill('cherryB');
  await page.getByTestId('register-name').press('CapsLock');
  await page.getByTestId('register-name').fill('cherryBee');
  await page.getByTestId('register-email').click();
  await page.getByTestId('register-email').fill('cherybee@gmail.com');
  await page.getByTestId('register-phone').click();
  await page.getByTestId('register-phone').fill('1568978563');
  await page.getByTestId('register-password').click();
  await page.getByTestId('register-password').fill('456asdf*');
  await page.getByTestId('register-confirm').click();
  await page.getByTestId('register-confirm').fill('456asdf*');
  await page.getByTestId('register-submit').click();
  await expect(page.getByTestId('nav-user')).toContainText('cherryBee');
  await page.getByTestId('account-holder').click();
});