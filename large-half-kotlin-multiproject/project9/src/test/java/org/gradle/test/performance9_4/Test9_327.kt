package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_327 {
    private val production = Production9_327("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}