/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        'text': '#0f0911',
        'background': '#f6f2f8',
        'primary': '#9b43c1',
        'secondary': '#ca9cbb',
        'accent': '#bf869d',
       },
    },
  },
  plugins: [],
}


