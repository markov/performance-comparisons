package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_307 {
    private val production = Production9_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}