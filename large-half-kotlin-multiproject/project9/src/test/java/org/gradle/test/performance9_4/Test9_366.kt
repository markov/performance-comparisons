package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_366 {
    private val production = Production9_366("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}