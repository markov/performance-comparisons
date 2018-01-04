package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_45 {
    private val production = Production29_45("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}