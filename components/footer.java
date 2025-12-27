class CustomFooter extends HTMLElement {
  connectedCallback() {
    this.attachShadow({ mode: 'open' });
    this.shadowRoot.innerHTML = `
      <style>
        .footer-link {
          transition: all 0.2s ease;
        }
        .footer-link:hover {
          color: #22c55e;
          transform: translateX(4px);
        }
        .social-icon {
          transition: all 0.3s ease;
        }
        .social-icon:hover {
          transform: translateY(-3px);
        }
      </style>
      <footer class="bg-ink-900 text-white">
        <div class="container mx-auto px-6 py-12">
          <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-12">
            <!-- Column 1 -->
            <div>
              <div class="flex items-center mb-6">
                <i data-feather="feather" class="text-pine-400 w-8 h-8"></i>
                <span class="ml-2 text-xl font-bold text-white">Pine Ink</span>
              </div>
              <p class="text-ink-400 mb-6">Growing businesses through nature-inspired digital solutions.</p>
              <div class="flex space-x-4">
                <a href="#" class="social-icon bg-ink-800 hover:bg-pine-600 p-3 rounded-full">
                  <i data-feather="twitter" class="w-5 h-5"></i>
                </a>
                <a href="#" class="social-icon bg-ink-800 hover:bg-pine-600 p-3 rounded-full">
                  <i data-feather="linkedin" class="w-5 h-5"></i>
                </a>
                <a href="#" class="social-icon bg-ink-800 hover:bg-pine-600 p-3 rounded-full">
                  <i data-feather="facebook" class="w-5 h-5"></i>
                </a>
                <a href="#" class="social-icon bg-ink-800 hover:bg-pine-600 p-3 rounded-full">
                  <i data-feather="instagram" class="w-5 h-5"></i>
                </a>
              </div>
            </div>
            
            <!-- Column 2 -->
            <div>
              <h3 class="text-lg font-semibold mb-6">Product</h3>
              <ul class="space-y-3">
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Features <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Pricing <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Case Studies <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Updates <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
              </ul>
            </div>
            
            <!-- Column 3 -->
            <div>
              <h3 class="text-lg font-semibold mb-6">Company</h3>
              <ul class="space-y-3">
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">About Us <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Careers <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Blog <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
                <li><a href="#" class="footer-link text-ink-400 hover:text-pine-400 flex items-center">Contact <i data-feather="chevron-right" class="ml-1 w-4 h-4"></i></a></li>
              </ul>
            </div>
            
            <!-- Column 4 -->
            <div>
              <h3 class="text-lg font-semibold mb-6">Subscribe</h3>
              <p class="text-ink-400 mb-4">Get the latest news and updates from Pine Ink.</p>
              <form class="flex">
                <input type="email" placeholder="Your email" class="px-4 py-2 w-full rounded-l-lg focus:outline-none text-ink-900">
                <button type="submit" class="bg-pine-600 hover:bg-pine-700 px-4 py-2 rounded-r-lg">
                  <i data-feather="send" class="w-5 h-5 text-white"></i>
                </button>
              </form>
              <p class="text-xs text-ink-500 mt-3">We respect your privacy. Unsubscribe at any time.</p>
            </div>
          </div>
          
          <div class="border-t border-ink-800 mt-12 pt-8 flex flex-col md:flex-row justify-between items-center">
            <p class="text-ink-500 text-sm mb-4 md:mb-0">© 2023 Pine Ink. All rights reserved.</p>
            <div class="flex space-x-6">
              <a href="#" class="text-ink-500 hover:text-pine-400 text-sm">Terms</a>
              <a href="#" class="text-ink-500 hover:text-pine-400 text-sm">Privacy</a>
              <a href="#" class="text-ink-500 hover:text-pine-400 text-sm">Cookies</a>
            </div>
          </div>
        </div>
      </footer>
    `;
  }
}
customElements.define('custom-footer', CustomFooter);