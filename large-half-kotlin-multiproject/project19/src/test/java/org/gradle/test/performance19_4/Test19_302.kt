package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_302 {
    private val production = Production19_302("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}