package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_107 {
    private val production = Production29_107("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}