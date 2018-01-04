package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_474 {
    private val production = Production19_474("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}