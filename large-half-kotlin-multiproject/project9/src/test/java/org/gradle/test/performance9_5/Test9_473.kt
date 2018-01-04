package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_473 {
    private val production = Production9_473("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}