// Legal Modals - Disclaimer & Privacy Policy
// Include this script in all pages

function showDisclaimer() {
    const modal = document.getElementById('legalModal');
    const title = document.getElementById('legalModalTitle');
    const content = document.getElementById('legalModalContent');

    title.innerHTML = '⚠️ Disclaimer';
    content.innerHTML = `
        <p><strong>USE AT YOUR OWN RISK</strong></p>
        <p>Gelatine Network is an experimental blockchain platform. By using this website and interacting with the Gelatine Network, you acknowledge and agree to the following:</p>
        
        <ul>
            <li><strong>Experimental Technology:</strong> This blockchain and all associated smart contracts are experimental and may contain bugs or vulnerabilities.</li>
            <li><strong>No Warranty:</strong> The software is provided "AS IS" without warranty of any kind, express or implied.</li>
            <li><strong>Financial Risk:</strong> Cryptocurrencies and NFTs have no intrinsic value. You may lose all funds you invest or use on this platform.</li>
            <li><strong>No Investment Advice:</strong> Nothing on this site constitutes investment, legal, or financial advice.</li>
            <li><strong>Smart Contract Risk:</strong> Smart contracts cannot be reversed once executed. Always verify transaction details before confirming.</li>
            <li><strong>Network Changes:</strong> The network may undergo changes, upgrades, or discontinuation at any time without notice.</li>
        </ul>
        
        <p><strong>By continuing to use this website, you accept full responsibility for any and all risks associated with cryptocurrency transactions and blockchain interactions.</strong></p>
    `;

    modal.style.display = 'flex';
}

function showPrivacy() {
    const modal = document.getElementById('legalModal');
    const title = document.getElementById('legalModalTitle');
    const content = document.getElementById('legalModalContent');

    title.innerHTML = 'Privacy Policy';
    content.innerHTML = `
        <div style="text-align: center; margin-bottom: 2rem;">
            <div class="legal-badge">VERSION_2.1 // RESEARCH_STANCE</div>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="shield"></i> Research Ethics & Data</h3>
            <p>Pine Ink is a technical research collective. This website serves as an informational portal for our findings. We do <strong>NOT</strong> collect, store, or process any personal data, session recordings, or visitor identities on our infrastructure.</p>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="eye-off"></i> Zero-Knowledge Operations</h3>
            <p>Our commitment to privacy means we explicitly do not collect:</p>
            <ul>
                <li>Email addresses, names, or contact details</li>
                <li>IP addresses or geographical location data</li>
                <li>Tracking cookies, analytical scripts, or pixels</li>
                <li>Any form of user-provided metadata</li>
            </ul>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="activity"></i> Blockchain Transparency</h3>
            <p>While this website does not interact with the blockchain directly, the Gelatine Network research we conduct is centered on public, permanent ledgers. Our published research and network specifications are open for public audit.</p>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="layers"></i> External Infrastructure</h3>
            <p>To deliver a high-velocity experience, we utilize:</p>
            <ul>
                <li><strong>Stateless Hosting:</strong> Decentralized or static delivery networks.</li>
                <li><strong>Technical Support:</strong> Any communication via the research email is handled with strict confidentiality.</li>
            </ul>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="mail"></i> Voluntary Communication</h3>
            <p>If you choose to contact the collective via email, we will receive your email address and any information you provide. This data is used <strong>strictly</strong> to respond to your inquiry and is never shared, sold, or used for tracking purposes.</p>
        </div>
        
        <div class="legal-section">
            <h3><i data-feather="help-circle"></i> Technical Inquiries</h3>
            <p>For questions regarding our privacy-first architecture or the Gelatine Network research, contact the collective at: <span class="mono" style="color: var(--accent-glow);">research@pine.ink</span></p>
        </div>
    `;



    // Re-trigger feather icons for the new content
    if (window.feather) {
        window.feather.replace();
    }


    modal.style.display = 'flex';
}

function closeLegalModal() {
    document.getElementById('legalModal').style.display = 'none';
}
