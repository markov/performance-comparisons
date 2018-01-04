package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_45 {
    private val production = Production34_45("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}