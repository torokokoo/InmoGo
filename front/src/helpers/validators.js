import { helpers, email, required } from '@vuelidate/validators';

export const requiredPassword$ = helpers.withMessage('Debes ingresar una contrasena', required);
export const requiredEmail$ = helpers.withMessage('Debes ingresar un correo electronico', required);
export const requiredRut$ = helpers.withMessage('Debes ingresar tu RUT', required);
export const requiredName$ = helpers.withMessage('Debes ingresar un nombre', required);
export const email$ = helpers.withMessage('Debes ingresar un correo valido', email);