package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_62 {
    private val production = Production29_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}