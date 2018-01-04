package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_359 {
    private val production = Production9_359("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}