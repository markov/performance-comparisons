package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_431 {
    private val production = Production9_431("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}