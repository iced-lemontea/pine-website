class CustomNavbar extends HTMLElement {
  connectedCallback() {
    this.attachShadow({ mode: 'open' });
    this.shadowRoot.innerHTML = `
      <style>
        .nav-link {
          position: relative;
        }
        .nav-link::after {
          content: '';
          position: absolute;
          width: 0;
          height: 2px;
          bottom: -2px;
          left: 0;
          background-color: #22c55e;
          transition: width 0.3s ease;
        }
        .nav-link:hover::after {
          width: 100%;
        }
        .mobile-menu {
          max-height: 0;
          overflow: hidden;
          transition: max-height 0.3s ease-out;
        }
        .mobile-menu.open {
          max-height: 500px;
        }
      </style>
      <nav class="bg-white shadow-sm sticky top-0 z-50">
        <div class="container mx-auto px-6 py-4">
          <div class="flex items-center justify-between">
            <!-- Logo -->
            <div class="flex items-center">
              <a href="#" class="flex items-center">
                <i data-feather="feather" class="text-pine-600 w-8 h-8"></i>
                <span class="ml-2 text-xl font-bold text-pine-900">Pine Ink</span>
              </a>
            </div>
            
            <!-- Desktop Menu -->
            <div class="hidden md:flex items-center space-x-8">
              <a href="#features" class="nav-link text-ink-700 hover:text-pine-600 font-medium">Features</a>
              <a href="#demo" class="nav-link text-ink-700 hover:text-pine-600 font-medium">Demo</a>
              <a href="#" class="nav-link text-ink-700 hover:text-pine-600 font-medium">Pricing</a>
              <a href="#" class="nav-link text-ink-700 hover:text-pine-600 font-medium">Resources</a>
              <a href="#demo" class="bg-pine-600 hover:bg-pine-700 text-white font-medium py-2 px-6 rounded-lg shadow transition-all transform hover:scale-105">
                Get Started
              </a>
            </div>
            
            <!-- Mobile Menu Button -->
            <div class="md:hidden">
              <button id="mobile-menu-button" class="text-ink-700 hover:text-pine-600 focus:outline-none">
                <i data-feather="menu" class="w-6 h-6"></i>
              </button>
            </div>
          </div>
        </div>
        
        <!-- Mobile Menu -->
        <div id="mobile-menu" class="mobile-menu md:hidden bg-white">
          <div class="container mx-auto px-6 pt-2 pb-4">
            <div class="flex flex-col space-y-4">
              <a href="#features" class="text-ink-700 hover:text-pine-600 font-medium py-2 border-b border-pine-50">Features</a>
              <a href="#demo" class="text-ink-700 hover:text-pine-600 font-medium py-2 border-b border-pine-50">Demo</a>
              <a href="#" class="text-ink-700 hover:text-pine-600 font-medium py-2 border-b border-pine-50">Pricing</a>
              <a href="#" class="text-ink-700 hover:text-pine-600 font-medium py-2 border-b border-pine-50">Resources</a>
              <a href="#demo" class="bg-pine-600 hover:bg-pine-700 text-white font-medium py-3 px-6 rounded-lg shadow text-center mt-2">
                Get Started
              </a>
            </div>
          </div>
        </div>
      </nav>
    `;

    // Mobile menu toggle
    const mobileMenuButton = this.shadowRoot.getElementById('mobile-menu-button');
    const mobileMenu = this.shadowRoot.getElementById('mobile-menu');

    mobileMenuButton.addEventListener('click', () => {
      mobileMenu.classList.toggle('open');
      const icon = mobileMenuButton.querySelector('i');
      if (mobileMenu.classList.contains('open')) {
        icon.setAttribute('data-feather', 'x');
      } else {
        icon.setAttribute('data-feather', 'menu');
      }
      feather.replace();
    });
  }
}
customElements.define('custom-navbar', CustomNavbar);