/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.flamingo.api.ribbon.wrapper.model;

import org.pushingpixels.flamingo.api.common.HorizontalAlignment;
import org.pushingpixels.flamingo.api.common.model.ImmutablePresentationModel;

/**
 * Encapsulates presentation metadata for displaying wrapped components. Use a new instance of
 * {@link Builder} to configure a new presentation, and {@link Builder#build()} to build a
 * presentation.
 *
 * @author Kirill Grouchnikov
 */
public class WrapperPresentation implements ImmutablePresentationModel {
    private boolean isFlat;
    private HorizontalAlignment horizontalAlignment;
    private String keyTip;
    private boolean isResizingAware;

    private WrapperPresentation() {
    }

    public static WrapperPresentation withDefaults() {
        return WrapperPresentation.builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isFlat() {
        return this.isFlat;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public String getKeyTip() {
        return this.keyTip;
    }

    public boolean isResizingAware() {
        return this.isResizingAware;
    }

    public static class Builder {
        private boolean isFlat = true;
        private HorizontalAlignment horizontalAlignment = HorizontalAlignment.FILL;
        private String keyTip;
        private boolean isResizingAware;

        public Builder setFlat(boolean flat) {
            this.isFlat = flat;
            return this;
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setKeyTip(String keyTip) {
            this.keyTip = keyTip;
            return this;
        }

        public Builder setResizingAware(boolean resizingAware) {
            this.isResizingAware = resizingAware;
            return this;
        }

        public WrapperPresentation build() {
            WrapperPresentation commandPresentation = new WrapperPresentation();
            commandPresentation.horizontalAlignment = this.horizontalAlignment;
            commandPresentation.isFlat = this.isFlat;
            commandPresentation.keyTip = this.keyTip;
            commandPresentation.isResizingAware = this.isResizingAware;
            return commandPresentation;
        }
    }
}