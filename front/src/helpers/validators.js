import { helpers, email, required } from '@vuelidate/validators';

export const required$ = helpers.withMessage('Este campo no puede estar vacio', required);
export const email$ = helpers.withMessage('Debes ingresar un correo valido', email);