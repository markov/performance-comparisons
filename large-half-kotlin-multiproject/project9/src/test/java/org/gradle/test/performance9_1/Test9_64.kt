package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_64 {
    private val production = Production9_64("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}