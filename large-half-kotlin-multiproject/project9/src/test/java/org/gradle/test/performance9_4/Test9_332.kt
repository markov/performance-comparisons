package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_332 {
    private val production = Production9_332("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}