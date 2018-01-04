package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_41 {
    private val production = Production19_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}