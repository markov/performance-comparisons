package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_457 {
    private val production = Production9_457("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}