package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_46 {
    private val production = Production19_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}