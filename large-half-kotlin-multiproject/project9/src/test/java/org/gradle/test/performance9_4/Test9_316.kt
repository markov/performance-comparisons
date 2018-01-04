package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_316 {
    private val production = Production9_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}