var Chart = {
    "defaults": {
        "global": {
            "responsive": {},
            "responsiveAnimationDuration": {},
            "maintainAspectRatio": {},
            "events": {
                "0": {},
                "1": {},
                "2": {},
                "3": {},
                "4": {},
                "5": {}
            },
            "hover": {
                "onHover": function () {},
                "mode": {},
                "animationDuration": {}
            },
            "onClick": function () {},
            "defaultColor": {},
            "elements": {
                "arc": {
                    "backgroundColor": {},
                    "borderColor": {},
                    "borderWidth": {}
                },
                "line": {
                    "tension": {},
                    "backgroundColor": {},
                    "borderWidth": {},
                    "borderColor": {},
                    "borderCapStyle": {},
                    "borderDash": function () {},
                    "borderDashOffset": {},
                    "borderJoinStyle": {},
                    "fill": {}
                },
                "point": {
                    "radius": {},
                    "backgroundColor": {},
                    "borderWidth": {},
                    "borderColor": {},
                    "hitRadius": {},
                    "hoverRadius": {},
                    "hoverBorderWidth": {}
                },
                "rectangle": {
                    "backgroundColor": {},
                    "borderWidth": {},
                    "borderColor": {}
                }
            },
            "legendCallback": function () {},
            "animation": {
                "duration": {},
                "easing": {},
                "onProgress": function () {},
                "onComplete": function () {}
            },
            "tooltips": {
                "enabled": {},
                "custom": function () {},
                "mode": {},
                "backgroundColor": {},
                "titleFontFamily": {},
                "titleFontSize": {},
                "titleFontStyle": {},
                "titleSpacing": {},
                "titleMarginBottom": {},
                "titleColor": {},
                "titleAlign": {},
                "bodyFontFamily": {},
                "bodyFontSize": {},
                "bodyFontStyle": {},
                "bodySpacing": {},
                "bodyColor": {},
                "bodyAlign": {},
                "footerFontFamily": {},
                "footerFontSize": {},
                "footerFontStyle": {},
                "footerSpacing": {},
                "footerMarginTop": {},
                "footerColor": {},
                "footerAlign": {},
                "yPadding": {},
                "xPadding": {},
                "caretSize": {},
                "cornerRadius": {},
                "xOffset": {},
                "multiKeyBackground": {},
                "callbacks": {
                    "beforeTitle": function () {},
                    "title": function () {},
                    "afterTitle": function () {},
                    "beforeBody": function () {},
                    "beforeLabel": function () {},
                    "label": function () {},
                    "afterLabel": function () {},
                    "afterBody": function () {},
                    "beforeFooter": function () {},
                    "footer": function () {},
                    "afterFooter": function () {}
                }
            }
        },
        "scale": {
            "display": {},
            "gridLines": {
                "show": {},
                "color": {},
                "lineWidth": {},
                "drawOnChartArea": {},
                "drawTicks": {},
                "zeroLineWidth": {},
                "zeroLineColor": {},
                "offsetGridLines": {}
            },
            "scaleLabel": {
                "fontColor": {},
                "fontFamily": {},
                "fontSize": {},
                "fontStyle": {},
                "labelString": {},
                "show": {}
            },
            "ticks": {
                "beginAtZero": {},
                "fontSize": {},
                "fontStyle": {},
                "fontColor": {},
                "fontFamily": {},
                "maxRotation": {},
                "minRotation": {},
                "mirror": {},
                "padding": {},
                "reverse": {},
                "show": {},
                "callback": function () {}
            }
        },
        "bar": {
            "hover": {
                "mode": {}
            },
            "scales": {
                "xAxes": {
                    "0": {
                        "type": {},
                        "categoryPercentage": {},
                        "barPercentage": {},
                        "gridLines": {
                            "offsetGridLines": {}
                        }
                    }
                },
                "yAxes": {
                    "0": {
                        "type": {}
                    }
                }
            }
        },
        "bubble": {
            "hover": {
                "mode": {}
            },
            "scales": {
                "xAxes": {
                    "0": {
                        "type": {},
                        "position": {},
                        "id": {}
                    }
                },
                "yAxes": {
                    "0": {
                        "type": {},
                        "position": {},
                        "id": {}
                    }
                }
            },
            "tooltips": {
                "template": {},
                "multiTemplate": {}
            }
        },
        "doughnut": {
            "animation": {
                "animateRotate": {},
                "animateScale": {}
            },
            "hover": {
                "mode": {}
            },
            "cutoutPercentage": {}
        },
        "pie": {
            "animation": {
                "animateRotate": {},
                "animateScale": {}
            },
            "hover": {
                "mode": {}
            },
            "cutoutPercentage": {}
        },
        "line": {
            "hover": {
                "mode": {}
            },
            "scales": {
                "xAxes": {
                    "0": {
                        "type": {},
                        "id": {}
                    }
                },
                "yAxes": {
                    "0": {
                        "type": {},
                        "id": {}
                    }
                }
            }
        },
        "polarArea": {
            "scale": {
                "type": {},
                "lineArc": {}
            },
            "animateRotate": {},
            "animateScale": {}
        },
        "radar": {
            "scale": {
                "type": {}
            },
            "elements": {
                "line": {
                    "tension": {}
                }
            }
        }
    },
    "noConflict": function () {},
    "helpers": {
        "each": function () {},
        "clone": function () {},
        "extend": function () {},
        "configMerge": function () {},
        "extendDeep": function () {},
        "scaleMerge": function () {},
        "getValueAtIndexOrDefault": function () {},
        "indexOf": function () {},
        "where": function () {},
        "findNextWhere": function () {},
        "findPreviousWhere": function () {},
        "inherits": function () {},
        "noop": function () {},
        "uid": function () {},
        "warn": function () {},
        "amd": {},
        "isNumber": function () {},
        "max": function () {},
        "min": function () {},
        "sign": function () {},
        "log10": function () {},
        "getDecimalPlaces": function () {},
        "toRadians": function () {},
        "toDegrees": function () {},
        "getAngleFromPoint": function () {},
        "aliasPixel": function () {},
        "splineCurve": function () {},
        "nextItem": function () {},
        "previousItem": function () {},
        "niceNum": function () {},
        "easingEffects": {
            "linear": function () {},
            "easeInQuad": function () {},
            "easeOutQuad": function () {},
            "easeInOutQuad": function () {},
            "easeInCubic": function () {},
            "easeOutCubic": function () {},
            "easeInOutCubic": function () {},
            "easeInQuart": function () {},
            "easeOutQuart": function () {},
            "easeInOutQuart": function () {},
            "easeInQuint": function () {},
            "easeOutQuint": function () {},
            "easeInOutQuint": function () {},
            "easeInSine": function () {},
            "easeOutSine": function () {},
            "easeInOutSine": function () {},
            "easeInExpo": function () {},
            "easeOutExpo": function () {},
            "easeInOutExpo": function () {},
            "easeInCirc": function () {},
            "easeOutCirc": function () {},
            "easeInOutCirc": function () {},
            "easeInElastic": function () {},
            "easeOutElastic": function () {},
            "easeInOutElastic": function () {},
            "easeInBack": function () {},
            "easeOutBack": function () {},
            "easeInOutBack": function () {},
            "easeInBounce": function () {},
            "easeOutBounce": function () {},
            "easeInOutBounce": function () {}
        },
        "requestAnimFrame": function () {},
        "cancelAnimFrame": function () {},
        "getRelativePosition": function () {},
        "addEvent": function () {},
        "removeEvent": function () {},
        "bindEvents": function () {},
        "unbindEvents": function () {},
        "getConstraintWidth": function () {},
        "getConstraintHeight": function () {},
        "getMaximumWidth": function () {},
        "getMaximumHeight": function () {},
        "getStyle": function () {},
        "getMaximumSize": function () {},
        "retinaScale": function () {},
        "clear": function () {},
        "fontString": function () {},
        "longestText": function () {},
        "drawRoundedRectangle": function () {},
        "color": function () {},
        "addResizeListener": function () {},
        "removeResizeListener": function () {},
        "isArray": function () {},
        "isDatasetVisible": function () {}
    },
    "elements": {
        "Arc": function () {},
        "Line": function () {},
        "Point": function () {},
        "Rectangle": function () {}
    },
    "Element": function () {},
    "Animation": function () {},
    "animationService": {
        "frameDuration": {},
        "animations": function () {},
        "dropFrames": {},
        "addAnimation": function () {},
        "cancelAnimation": function () {},
        "digestWrapper": function () {},
        "startDigest": function () {}
    },
    "types": function () {},
    "instances": function () {},
    "controllers": {
        "bar": function () {},
        "bubble": function () {},
        "pie": function () {},
        "doughnut": function () {},
        "line": function () {},
        "polarArea": function () {},
        "radar": function () {}
    },
    "Controller": function () {},
    "Scale": function () {},
    "scaleService": {
        "constructors": {
            "category": function () {},
            "linear": function () {},
            "logarithmic": function () {},
            "radialLinear": function () {}
        },
        "defaults": {
            "category": {
                "position": {}
            },
            "linear": {
                "position": {},
                "ticks": {
                    "callback": function () {}
                }
            },
            "logarithmic": {
                "position": {},
                "ticks": {
                    "callback": function () {}
                }
            },
            "radialLinear": {
                "display": {},
                "animate": {},
                "lineArc": {},
                "position": {},
                "angleLines": {
                    "show": {},
                    "color": {},
                    "lineWidth": {}
                },
                "ticks": {
                    "showLabelBackdrop": {},
                    "backdropColor": {},
                    "backdropPaddingY": {},
                    "backdropPaddingX": {}
                },
                "pointLabels": {
                    "fontFamily": {},
                    "fontStyle": {},
                    "fontSize": {},
                    "fontColor": {}
                }
            }
        },
        "registerScaleType": function () {},
        "getScaleConstructor": function () {},
        "getScaleDefaults": function () {},
        "update": function () {}
    },
    "Tooltip": function () {},
    "Bar": function () {},
    "Bubble": function () {},
    "Doughnut": function () {},
    "Line": function () {},
    "PolarArea": function () {},
    "Radar": function () {},
    "Scatter": function () {}
};
